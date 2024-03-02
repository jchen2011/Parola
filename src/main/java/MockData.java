import java.util.ArrayList;

public class MockData {
    private ArrayList<Quiz> quizzes;

    public MockData() {
        this.quizzes = new ArrayList<>();
        this.quizzes.add(initiateQuiz1());
        this.quizzes.add(initiateQuiz2());
    }
    public ArrayList<Quiz> getAllQuizzes() {
        return this.quizzes;
    }

    private Quiz initiateQuiz1() {
        Quiz qz1 = new Quiz("Voorbeeld quiz");

        MultipleChoiceQuestion q1 = new MultipleChoiceQuestion("Wat is de hoofdstad van Libie?");
        q1.addChoice("A. Bayda");
        q1.addChoice("B. Benghazi");
        q1.addChoice("C. Misrata");
        q1.addChoice("D. Tripoli");
        q1.addCorrectAnswer("D");
        qz1.addQuestion(q1);

        MultipleChoiceQuestion q2 = new MultipleChoiceQuestion("Hoe heet het officieuze landenkampioenschap tennis voor mannen?");
        q2.addChoice("A. Davis Cup");
        q2.addChoice("B. Diamond League");
        q2.addChoice("C. Fed Cup");
        q2.addChoice("D. Nations League");
        q2.addCorrectAnswer("A");
        qz1.addQuestion(q2);

        MultipleChoiceQuestion q3 = new MultipleChoiceQuestion("Hoe heet de schrijver van de Millennium-triologie, een reeks misdaadromans? Het eerste boek uit de reeks heet 'Mannen die vrouwen haten'");
        q3.addChoice("A. Henning Mankell");
        q3.addChoice("B. Jo Nesbo");
        q3.addChoice("C. Lars Kepler");
        q3.addChoice("D. Stieg Larsson");
        q3.addCorrectAnswer("D");
        qz1.addQuestion(q3);

        MultipleChoiceQuestion q4 = new MultipleChoiceQuestion("Welke van de volgende Engelse voetbalclubs is afkomstig uit Liverpool?");
        q4.addChoice("A. Arsenal");
        q4.addChoice("B. Chelsea");
        q4.addChoice("C. Everton");
        q4.addChoice("D. Tottenham Hotspur");
        q4.addCorrectAnswer("C");
        qz1.addQuestion(q4);

        OpenQuestion q5 = new OpenQuestion("In welke staat van de VS ligt de stad Los Angeles?");
        q5.addCorrectAnswer("California");
        q5.addCorrectAnswer("Californië");
        qz1.addQuestion(q5);

        OpenQuestion q6 = new OpenQuestion("Wat is de artiestnaam van de rapper Marshall Bruce Mathers III");
        q6.addCorrectAnswer("Eminem");
        qz1.addQuestion(q6);

        OpenQuestion q7 = new OpenQuestion("Mathieu van der Poel en zijn vader, die ook wielrenner was, hebben allebei de gele trui gedragen in de Tour de France. Wat is de voornaam van de vader van Mathieu?");
        q7.addCorrectAnswer("Adri");
        q7.addCorrectAnswer("Adrie");
        qz1.addQuestion(q7);

        OpenQuestion q8 = new OpenQuestion("Hoe noem je een persoon die zich bezighoudt met bijenteelt?");
        q8.addCorrectAnswer("imker");
        q8.addCorrectAnswer("bijker");
        qz1.addQuestion(q8);

        return qz1;
    }

    private Quiz initiateQuiz2() {
        Quiz qz2 = new Quiz("Voetbal");

        OpenQuestion q1 = new OpenQuestion("Wie won de WK in 2022?");
        q1.addCorrectAnswer("argentenie");
        q1.addCorrectAnswer("argentinië");
        qz2.addQuestion(q1);

        MultipleChoiceQuestion q2 = new MultipleChoiceQuestion("Waar wordt de WK 2022 gehouden?");
        q2.addChoice("A. Nederland");
        q2.addChoice("B. Arnhem");
        q2.addChoice("C. Qatar");
        q2.addChoice("D. China");
        q2.addCorrectAnswer("C");
        qz2.addQuestion(q2);

        MultipleChoiceQuestion q3 = new MultipleChoiceQuestion("Het eerste FIFA World Cup-toernooi werd gehouden in?");
        q3.addChoice("A. 1928");
        q3.addChoice("B. 1929");
        q3.addChoice("C. 1930");
        q3.addCorrectAnswer("C");
        qz2.addQuestion(q3);

        MultipleChoiceQuestion q4 = new MultipleChoiceQuestion("Hoe heette het dierenorakel dat de uitslagen van WK-wedstrijden in 2010 voorspelde door te eten uit dozen met vlaggen erop??");
        q4.addChoice("A. Sid de inktvis");
        q4.addChoice("B. Paul de Octopus");
        q4.addChoice("C. Alan de wombat");
        q4.addChoice("D. Cecil de Leeuw");
        q4.addCorrectAnswer("B");
        qz2.addQuestion(q4);


        MultipleChoiceQuestion q5 = new MultipleChoiceQuestion("Hoeveel teams mogen door naar de knock-outfase?");
        q5.addChoice("A. 8");
        q5.addChoice("B. 16");
        q5.addChoice("C. 24");
        q5.addCorrectAnswer("B");
        qz2.addQuestion(q5);

        MultipleChoiceQuestion q6 = new MultipleChoiceQuestion("Welk land nam als eerste uit Afrika deel aan een WK-finale?");
        q6.addChoice("A. Egypte");
        q6.addChoice("B. Marokko");
        q6.addChoice("C. Tunesie");
        q6.addChoice("D. Algerije");
        q6.addCorrectAnswer("A");
        qz2.addQuestion(q6);

        MultipleChoiceQuestion q7 = new MultipleChoiceQuestion("Welk land won als eerste twee World Cups?");
        q7.addChoice("A. Brazilie");
        q7.addChoice("B. Duitsland");
        q7.addChoice("C. Schotland");
        q7.addChoice("D. Italie");
        q7.addCorrectAnswer("D");
        qz2.addQuestion(q7);

        MultipleChoiceQuestion q8 = new MultipleChoiceQuestion("Hoe vaak is Schotland uitgeschakeld in de eerste ronde van het WK?");
        q8.addChoice("A. 8");
        q8.addChoice("B. 4");
        q8.addChoice("C. 6");
        q8.addChoice("D. 2");
        q8.addCorrectAnswer("A");
        qz2.addQuestion(q8);

        OpenQuestion q9 = new OpenQuestion("Wat is achternaam van Hakim?");
        q9.addCorrectAnswer("ziyech");
        qz2.addQuestion(q9);

        OpenQuestion q10 = new OpenQuestion("Wie won de topscorerstitel op het toernooi op Mexicaanse bodem in 1986?");
        q10.addCorrectAnswer("Gary Linker");
        qz2.addQuestion(q10);

        OpenQuestion q11 = new OpenQuestion("Welke kleur had de bal in de finale van 1966?");
        q11.addCorrectAnswer("fel oranje");
        q11.addCorrectAnswer("oranje");
        qz2.addQuestion(q11);

        OpenQuestion q12 = new OpenQuestion("In welk jaar werd het WK voor het eerst op tv uitgezonden?");
        q12.addCorrectAnswer("1954");
        qz2.addQuestion(q12);

        OpenQuestion q13 = new OpenQuestion("In welk voetbalstadion werd de finale van 1966 gespeeld?");
        q13.addCorrectAnswer("wembley");
        qz2.addQuestion(q13);

        return qz2;
    }
}
