package com.example.apavlidi.trueorflase;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by nomad on 4/12/2015.
 */


/*
O kodikas exei polla provlimata asfalias kai den einai simazemenos oute akolou8i oles tis simvasis tis glossas
Den ipirxe xronos na ginoun diorthoseis kai debugging
nomad
 */
public class Quiz extends Activity {
    Question question0ComputerScience = new Question("Το αποτέλσμα της πράξης true OR false βγάζει true", true);
    Question question1ComputerScience = new Question("Η JAVA υποστυρίζει πολλαπλή κληρονομικότητα", false,"Η JAVA δεν υποστηρίζει πολλαπλή κληρονομικότητα ");
    Question question2ComputerScience = new Question("Τα πρόγραμματα 'φορτώνονται' από τα αποθηκευτικά μέσα στη μνήμη του υπολογιστή", true);
    Question question3ComputerScience = new Question("Μια απο τις αρμοδιότητες του Λειτουργικού Συστήματος είναι να ελέγχει την εκτέλεση όλων των προγραμμάτων", false,"Αυτό δεν αποτελεί αρμοδιότητα του Λειτουργικού συστήματος");
    Question question4ComputerScience = new Question("Το αποτέλεσμα της λογικής πράξη NOT 1 είναι 0", true);
    Question question5ComputerScience = new Question(" O Bill Gates ενίαι ιδρυτής της Apple", false,"Ιδρυτές της Apple είναι Steve Jobs και Steven Wozniak");
    Question question6ComputerScience = new Question("Το δυαδικό σύστημα χρησιμοποιεί μονο τα ψηφία 0,1,2", false,"Το δυαδικό σύστημα χρησιμοποιεί μονο τα ψηφία 0,1");
    Question question7ComputerScience = new Question("Η γλώσσα προγραμματισμού C++ είναι αντικειμενοστραφής", true);
    Question question8ComputerScience = new Question("Ο πρώτος υπολογιστής ονομαζόταν ENIAC", true);
    Question question9ComputerScience = new Question("Η php δημιουργεί αρχέια με κατάληξη .phtml ", true);
    Question question10ComputerScience = new Question("Το πληκτρολόγιο είναι μονάδα εξόδου", false,"Το πληκτρολογίο είναι μονάδα εισόδου");
    Question question11ComputerScience = new Question("Η ROM ειναι πτητική", false,"Η ROM είναι μη πτητική");
    Question question12ComputerScience = new Question("Το Linux αποτελεί μια διανομή UNIX", true);
    Question question13ComputerScience = new Question("Διεργασία είναι καθέ πρόγραμμα", false,"Διεργασία είναι ένα πρόγραμμα που εκτελείται");
    Question question14ComputerScience = new Question("Η Python είναι γλωσα υψηλού επιπέδου", true);
    Question question15ComputerScience = new Question("Η πράξη 1 AND 1 OR 0 έχει ως αποτέλεσμα 0", false,"Η πράξη 1 AND 1 OR 0 έχει ως αποτέλεσμα 1");
    Question question16ComputerScience = new Question("Η Access ειναι DBMS", false,"Η Access δεν ειναι DBMS");
    Question question17ComputerScience = new Question("Η Pascal δημιουργήθηκε απο τον Nicklaus Wirth", true);
    Question question18ComputerScience = new Question("Το Youtube ανήκει στην Goggle", true);
    Question question19ComputerScience = new Question("Η πρώτη έκδοση του Android κυκλοφόρησε το 2010", false,"Η πρώτη έκδοση του Android κυκλοφόρησε το 2008");


    Question question0History = new Question("Ο Β' παγκόσμιος ξεκίνησε το 1914", false,"Ο Β' παγκόσμιος ξεκνίησε το 1937");
    Question question1History = new Question("Η κνωσός ήταν σπουδαίο κέντρο του μινωικού πολιτισμού ", true);
    Question question2History = new Question("Ο στρατηγός των Ελλήνων στη μάχη του Μαραθώνα ήταν ο Παυσανίας", false,"Ο στρατηγός των Ελλήνων στη μάχη του Μαραθώνα ήταν ο Μιλτιάδης");
    Question question3History = new Question("Η ναυμαχία γστη Σαλαμίνα έγινε το 430  ", false,"Η ναυμαχία στη Σαλαμίνα έγινε το 480");
    Question question4History = new Question("Τον Ερυθρό Σταυρό τον ίδρυσε ο Ερρίκος Ντινάν", true);
    Question question5History = new Question("Ηγέτης ΕΣΣΔ σε Β΄ Παγκόσμιο Πόλεμο ήταν ο Λενιν", false,"Ηγέτης ΕΣΣΔ σε Β΄ Παγκόσμιο Πόλεμο ήταν ο Σταλιν");
    Question question6History = new Question("O 4ος αιώνας ονομάστηκε Χρυσός Αιώνας του Περικλή", false,"Ο χρυσός αιώνας που ονομάστηκε Χρυσός Αίωνας του Περικλή ήταν ο 5ος");
    Question question7History =new Question("Καινοτομία του Β` Πακοσμίου Πολέμου αποτέλεσε η ατομική βόμβα", true);
    Question question8History=new Question("Οι Μούσες της ελληνικής μυθολογίας ήταν 7", false,"Οι Μούσες της ελληνικής μυθολογίας ήταν 9");
    Question question9History= new Question("Οι δούλει στην αρχαια Σπαρτη ονομάζοταν έιλωτες", true);
    Question question10History= new Question("Η Αθήνα κατά τον Β' Πακγόσμιο πόλεμο έμεινε υπο γερμανική κατοχή για 1.264 ημέρες", true);
    Question question11History=new Question("Οι Μούσες της ελληνικής μυθολογίας ήταν 7", false,"Οι Μούσες της ελληνικής μυθολογίας ήταν 9");
    Question question12History=new Question("Η δικτακτορια του 1967 διήρκησε 7 χρόνια", true);
    Question question13History=new Question("Οι Μούσες της ελληνικής μυθολογίας ήταν 7", false,"Οι Μούσες της ελληνικής μυθολογίας ήταν 9");
    Question question14History=new Question("Το Τεξας πολεμησε για την ανεξαρτησία του απο το Μεξικό", true);
    Question question15History=new Question("Ο Μελωνας ζωμ", false,"Οι Μούσες της ελληνικής μυθολογίας ήταν 9");
    Question question16History=new Question("Ο Α' παγκόσμιος πόλεμος ξεκίνησε το 1912", false,"Ο Α' παγκόσμιος πόλεμος ξεκίνησε το 1914");
    Question question17History=new Question("Το όνομα του αλόγου του Μέγα Αλέξανδρου ήταν Βουκεφάλας", true);
    Question question18History=new Question("Η απελευθέρωση της Ελλάδα από τους τούρκους γιορτάζεται στης 21/6", false,"Η απελευθέρωση της Ελλάδα απο τους τούρκους έγινε το 28/10/1821");
    Question question19History=new Question("Ηγετικό πρόσωπο της Ιαπωνίας κατα τον Β' παγκόσμιο ήταν ο Χιροχίτο", true);



    Question question0General = new Question("Ο αινσταιν ανακαλυψε την θεωρία της σχετικότητας", true);
    Question question1General =  new Question("Πρωτεύουσα του νομού Ροδόπης είναι η Κομοτηνή", true);
    Question question2General = new Question("Πρωτεύουσα του νομού Ροδόπης είναι η Κομοτηνή", true);
    Question question3General = new Question("Η σφήκα έχει δύο ζεγη φτερών", true);
    Question question4General =new Question("Η Πορτογαλία δεν έχει φιλοξενήσει ποτέ ολυμπιακούς αγώνες", true);;
    Question question5General =new Question("Η Ρωσσία έχει στείλει ανθρώπους στην σελήνη", false,"Η Ρωσσία δεν έχει στείλει ανθρώπους στην σελήνη");
    Question question6General = new Question("Το ραδόνιο είναι ραδιενεργό στοιχείο", true);
    Question question7General =new Question("Η Σελήνη έχει ατμόσφαιρα", false,"Η Σελήνη δεν έχει ατμόσφαιρα");
    Question question8General=new Question("Το ΠΑΣΟΚ ιδρύθηκε απο τον Ανδρέα Παπανδρέου", true);
    Question question9General=new Question("Το άθροισμα των γωνιών ενός τριγώνου ισούται με 360 μοίρες", false,"Το άθροισμα των γωνιών ενός τριγώνου ισούται με 180 μοίρες");
    Question question10General= new Question("Το πιο ψηλό όρος στο ηλιακό μας σύστημα είναι το όρος Όλυπμος στον Άρη", true);
    Question question11General= new Question("Το χρώμιο έχει ατομικό αριθμό 64", false,"Το χρώμιο έχει ατομικό αριθμό 24");
    Question question12General= new Question("Στην ταινία 'Τιτανικος' πρωταγωνιστούσε ο Μπραντ Πιτ",false,"Πρωταγωνιστής της ταινίας ήταν ο Λονάρτο Ντι Καπριο");
    Question question13General= new Question("Το καλλιτεχνικό κίνημα του Ροκοκό δημιουργήθηκε στην Ιταλία", false,"Το Ροκοκό γεννήθηκε στην Γαλλία");
    Question question14General= new Question("Η Ελλάδα έγινε μέλος της Ευρωζώνης το 2003", false,"Η Ελλάδα έγινε μέλος της Ευρωζώνης το 2001");
    Question question15General= new Question("Ο αμέθυστος έχει κόκκινο χρώμα", false,"Το χρώμα του αμέθυστου ειναι μωβ");
    Question question16General= new Question("Η Ευρώπη αποκαλείται και Γηραιά ήπειρος", true);
    Question question17General= new Question("Η Ικαρία ειναι μεγαλυτερη σε έξκταση απο την Κάρπαθο", false,"Η Κάρπαθος έχει μεγαλύτερη έκταση απο την Ικαρία");
    Question question18General= new Question("Όταν κόβω ένα λαχανικό 'ζουλιέν' το κάνω ροδέλες", false,"Όταν κόβω ένα λαχανικό 'ζουλιέν' το κόβω σε μακρόστενα κομματάκια");
    Question question19General= new Question("Το αμπέρ είναι μονάδα μέτρησης της έντασης του ηλεκτρικού ρεύματος", true);



    static ArrayList<Question> ARRAY_Q = new ArrayList<>(11);
    static ArrayList<Question> ARRAY_Q_ComputerScience = new ArrayList<>(8);
    static ArrayList<Question> ARRAY_Q_History = new ArrayList<>(8);
    static ArrayList<Question> ARRAY_Q_General = new ArrayList<>(8);
    public static int CURRENT_LEVEL = 1;

    TextView txtQuestion;
    TextView txtLifes;
    TextView txtCorrectAnswers;
    TextView txtLevel;
    Button btnTrue;
    Button btnFalse;
    Button btnFold;
    Button btnGotIt;
    public static TextView txtTime;
    public static boolean FIRST_GAME = true;


    int currentQuestion = 0;
    public static int CORRECT_ANSWERS_REQUIRED = 3;
    public static int LIFES = 8;
    public int lifesLeft = LIFES;
    public static int CORRECT_ANSWERS = 0;
    public static int QUESTIONS_ASKED = 0;
    public static int FOLDS = 3;

    //timer
    private int sumTimer=0;
    private int timer = 15;
    private Handler handler;
    private boolean Running;


    static MediaPlayer quizSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);

        if (Options.MUSIC_ON) {
            quizSound = MediaPlayer.create(this, R.raw.music);
            quizSound.start();
        }

        Running = true;
        handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (Running) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            if (checkIfMusicEnded())
                            {
                                replayMusic();
                                sumTimer=0;
                            }
                            if (timer == 0) {
                                lifesLeft--;
                                if (checkIfLost()) {
                                    closeActivitySafely();
                                    Intent in = new Intent(getApplicationContext(), LostLevel.class);
                                    startActivity(in);
                                } else
                                    changeQuestion();
                            } else
                                timer--;
                            sumTimer++;
                            txtTime.setText("Χρονος: " + Integer.toString(timer));

                        }
                    });
                }
            }
        };
        new Thread(runnable).start();

        if (FIRST_GAME) {
            initializeArrayWithQuestions();
            FIRST_GAME = false;
        } else {
            ARRAY_Q = InformationLevel.ARRAY_Q;
        }
        txtQuestion = (TextView) findViewById(R.id.txtQuestion);
        txtCorrectAnswers = (TextView) findViewById(R.id.txtCorrectAnswers);
        txtLevel = (TextView) findViewById(R.id.txtLevel);
        txtLifes = (TextView) findViewById(R.id.txtLifes);
        btnTrue = (Button) findViewById(R.id.btnTrue);
        btnFalse = (Button) findViewById(R.id.btnFalse);
        btnFold = (Button) findViewById(R.id.btnFold);
        btnGotIt = (Button) findViewById(R.id.btnGotIt);
        txtTime = (TextView) findViewById(R.id.txtTime);

        txtTime.setText("Χρόνος: " + Integer.toString(timer));
        txtQuestion.setText(ARRAY_Q.get(currentQuestion).getStrQuestion());
        txtCorrectAnswers.setText(Quiz.CORRECT_ANSWERS + "/" + Quiz.CORRECT_ANSWERS_REQUIRED);
        txtLifes.setText(Quiz.LIFES + "/" + Quiz.LIFES);
        txtLevel.setText(txtLevel.getText() + Integer.toString(Quiz.CURRENT_LEVEL));
        btnFold.setText("Πάσσο: " + Integer.toString(FOLDS));
        btnGotIt.setVisibility(View.GONE);


        btnGotIt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnTrue.setVisibility(View.VISIBLE);
                btnFalse.setVisibility(View.VISIBLE);
                btnGotIt.setVisibility(View.GONE);
                Running = true;
                handler = new Handler();
                Runnable runnable = new Runnable() {
                    @Override
                    public void run() {
                        while (Running) {
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    if (checkIfMusicEnded())
                                    {
                                        replayMusic();
                                        sumTimer=0;
                                    }
                                    if (timer == 0) {
                                        lifesLeft--;
                                        if (checkIfLost()) {
                                            closeActivitySafely();
                                            Intent in = new Intent(getApplicationContext(), LostLevel.class);
                                            startActivity(in);
                                        } else
                                            changeQuestion();
                                    } else
                                        timer--;
                                    sumTimer++;
                                    txtTime.setText("Χρονος: " + Integer.toString(timer));

                                }
                            });
                        }
                    }
                };
                new Thread(runnable).start();
                QUESTIONS_ASKED++;
                ARRAY_Q.remove(currentQuestion);
                changeQuestion();
            }
        });

        btnTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ARRAY_Q.get(currentQuestion).getCorrectAnswer() == true) {
                    CORRECT_ANSWERS++;
                    QUESTIONS_ASKED++;
                    ARRAY_Q.remove(currentQuestion);
                    changeQuestion();
                } else {
                    btnTrue.setVisibility(View.GONE);
                    btnFalse.setVisibility(View.GONE);
                    btnGotIt.setVisibility(View.VISIBLE);
                    lifesLeft--;
                    Running=false;
                    txtQuestion.setText(ARRAY_Q.get(currentQuestion).getCorrectAnswerStr());
                }
            }
        });

        btnFalse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ARRAY_Q.get(currentQuestion).getCorrectAnswer() == false) {
                    CORRECT_ANSWERS++;
                    QUESTIONS_ASKED++;
                    ARRAY_Q.remove(currentQuestion);
                    changeQuestion();
                } else {
                    btnTrue.setVisibility(View.GONE);
                    btnFalse.setVisibility(View.GONE);
                    btnGotIt.setVisibility(View.VISIBLE);
                    lifesLeft--;
                    Running = false;
                    txtQuestion.setText(ARRAY_Q.get(currentQuestion).getStrQuestion());
                }
                //prepi na patisi got it gia na alla3i i erotisi!
            }
        });
        btnFold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (FOLDS > 0) {
                    changeQuestion();
                    FOLDS--;
                    btnFold.setText("Πάσσο: " + Integer.toString(FOLDS));
                    if (FOLDS == 0)
                        btnFold.setEnabled(false);
                }
            }
        });
    }

    private void replayMusic(){
        quizSound.stop();
        quizSound = MediaPlayer.create(this, R.raw.music);
        quizSound.start();
    }

    private boolean checkIfMusicEnded(){
        return (sumTimer>48);
    }

    private void closeActivitySafely() {
        timer = 15;
        sumTimer=0;
        FIRST_GAME=true;
        Running = false;
        if (Options.MUSIC_ON)
            quizSound.stop();
    }

    @Override
    public void onBackPressed() {
        confirmExitDialog();
    }

    private void confirmExitDialog() {
        AlertDialog.Builder alertDlg = new AlertDialog.Builder(this);
        alertDlg.setMessage("Είστε σίγουρος οτι θέλετε να πάτε στο μενού;");
        alertDlg.setCancelable(false);

        alertDlg.setPositiveButton("Ναι", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                closeActivitySafely();
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        alertDlg.setNegativeButton("Όχι", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        alertDlg.create().show();
    }

    private void initializeArrayWithQuestions() {
        switch (Categories.CATEGORY_CHOOSE){
            case "ComputerScience":
                ARRAY_Q_ComputerScience.add(question0ComputerScience);
                ARRAY_Q_ComputerScience.add(question1ComputerScience);
                ARRAY_Q_ComputerScience.add(question2ComputerScience);
                ARRAY_Q_ComputerScience.add(question3ComputerScience);
                ARRAY_Q_ComputerScience.add(question4ComputerScience);
                ARRAY_Q_ComputerScience.add(question5ComputerScience);
                ARRAY_Q_ComputerScience.add(question6ComputerScience);
                ARRAY_Q_ComputerScience.add(question7ComputerScience);
                ARRAY_Q_ComputerScience.add(question8ComputerScience);
                ARRAY_Q_ComputerScience.add(question9ComputerScience);
                ARRAY_Q_ComputerScience.add(question10ComputerScience);
                ARRAY_Q_ComputerScience.add(question11ComputerScience);
                ARRAY_Q_ComputerScience.add(question12ComputerScience);
                ARRAY_Q_ComputerScience.add(question13ComputerScience);
                ARRAY_Q_ComputerScience.add(question14ComputerScience);
                ARRAY_Q_ComputerScience.add(question15ComputerScience);
                ARRAY_Q_ComputerScience.add(question7ComputerScience);
                ARRAY_Q_ComputerScience.add(question8ComputerScience);
                ARRAY_Q_ComputerScience.add(question9ComputerScience);
                ARRAY_Q=ARRAY_Q_ComputerScience;
                break;
            case "History":
                ARRAY_Q_History.add(question0History);
                ARRAY_Q_History.add(question1History);
                ARRAY_Q_History.add(question2History);
                ARRAY_Q_History.add(question3History);
                ARRAY_Q_History.add(question4History);
                ARRAY_Q_History.add(question5History);
                ARRAY_Q_History.add(question6History);
                ARRAY_Q_History.add(question7History);
                ARRAY_Q_History.add(question8History);
                ARRAY_Q_History.add(question9History);
                ARRAY_Q_History.add(question10History);
                ARRAY_Q_History.add(question11History);
                ARRAY_Q_History.add(question12History);
                ARRAY_Q_History.add(question13History);
                ARRAY_Q_History.add(question14History);
                ARRAY_Q_History.add(question15History);
                ARRAY_Q_History.add(question16History);
                ARRAY_Q_History.add(question17History);
                ARRAY_Q_History.add(question18History);
                ARRAY_Q_History.add(question19History);
                ARRAY_Q=ARRAY_Q_History;
                break;
            case "General":
                ARRAY_Q_General.add(question0General);
                ARRAY_Q_General.add(question1General);
                ARRAY_Q_General.add(question2General);
                ARRAY_Q_General.add(question3General);
                ARRAY_Q_General.add(question4General);
                ARRAY_Q_General.add(question5General);
                ARRAY_Q_General.add(question6General);
                ARRAY_Q_General.add(question7General);
                ARRAY_Q_General.add(question8General);
                ARRAY_Q_General.add(question9General);
                ARRAY_Q_General.add(question10General);
                ARRAY_Q_General.add(question11General);
                ARRAY_Q_General.add(question12General);
                ARRAY_Q_General.add(question13General);
                ARRAY_Q_General.add(question14General);
                ARRAY_Q_General.add(question15General);
                ARRAY_Q_General.add(question16General);
                ARRAY_Q_General.add(question17General);
                ARRAY_Q_General.add(question18General);
                ARRAY_Q_General.add(question19General);
                ARRAY_Q=ARRAY_Q_General;
                break;
        }
    }


    public boolean checkIfLost() {
        return (lifesLeft == 0);
    }

    public boolean checkIfWon() {
        return (CORRECT_ANSWERS == CORRECT_ANSWERS_REQUIRED);
    }

    public void changeQuestion() {
        if (!ARRAY_Q.isEmpty()) {
        do {
            currentQuestion = (int) (Math.random() * 20);
        } while (currentQuestion >= ARRAY_Q.size());
            if (checkIfLost()) {
                closeActivitySafely();
                Intent in = new Intent(getApplicationContext(), LostLevel.class);
                startActivity(in);
            } else if (checkIfWon()) {
                closeActivitySafely();
                Intent in = new Intent(getApplicationContext(), WinLevel.class);
                startActivity(in);
            } else {
                timer = 15;
                txtQuestion.setText(ARRAY_Q.get(currentQuestion).getStrQuestion());
                txtCorrectAnswers.setText(Quiz.CORRECT_ANSWERS + "/" + Quiz.CORRECT_ANSWERS_REQUIRED);
                txtLifes.setText(lifesLeft + "/" + Quiz.LIFES);
            }
        }else
            initializeArrayWithQuestions();  //teliosan oi erotisis
    }
}

