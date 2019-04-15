package Netologia.task_4_5.task_4_5_2;

import java.util.*;

public class Main {
    public static final List<String> LIST_ANSWER_YES = new ArrayList(Arrays.asList("L","l","Д","д"));
    public static Set<Candidate> candidates;

    public static void main(String[] args) {
        CandidateComparator candidateComparator = new CandidateComparator();

        System.out.println("Задача: Система подбора кандидатов.\n");

        Candidate candidate1 = new Candidate( "Иванов Иван Иванович", "муж", "25", 4, 5);
        Candidate candidate2 = new Candidate( "Петров Иван Александрович", "муж", "28", 4, 3);
        Candidate candidate3 = new Candidate( "Максимов Иван Александрович", "муж", "24", 3, 5);
        Candidate candidate4 = new Candidate( "Маркова Мария Ивановна", "жен", "25", 4, 4);
        Candidate candidate5 = new Candidate( "Соловьев Антон Викторович", "муж", "25", 4, 2);
        Candidate candidate6 = new Candidate( "Седоков Владимир Яковлевич", "муж", "25", 4, 1);
        Candidate candidate7 = new Candidate( "Семенчук Игорь Вмниаминович", "муж", "25", 3, 1);
        Candidate candidate8 = new Candidate( "Попова Мария Марковна", "жен", "25", 1, 1);
        Candidate candidate9 = new Candidate( "Смирнов Алексей Артемьевич", "муж", "25", 2, 5);
        Candidate candidate10 = new Candidate( "Пушкарева Инна Семеновна", "жен", "25", 3, 2);
        Candidate candidate11 = new Candidate( "Герасимов Станислав Петрович", "муж", "25", 0, 0);
        Candidate candidate12 = new Candidate( "Долгова Анна Петровна", "жен", "25", 3, 0);
        Candidate candidate13 = new Candidate( "Каримов Ильфат Фасхудинович", "муж", "25", 3, 4);

        candidates = new TreeSet<>(candidateComparator);

        candidates.add(candidate1);
        candidates.add(candidate2);
        candidates.add(candidate3);
        candidates.add(candidate4);
        candidates.add(candidate5);
        candidates.add(candidate6);
        candidates.add(candidate7);
        candidates.add(candidate8);
        candidates.add(candidate9);
        candidates.add(candidate10);
        candidates.add(candidate11);
        candidates.add(candidate12);
        candidates.add(candidate13);

        addCandidates();

        System.out.println("Список кандидатов:\n" +
                "ФИО, Релевантность резюме, Оценка на собеседовании\n");
        int i = 1;
        for (Candidate candidate: candidates) {
            System.out.println(i++ + ". " + candidate.toString());
        }
    }

    public static void addCandidates(){
        Scanner scanner = new Scanner(System.in);
        String input;
        String exit = "";

        while(LIST_ANSWER_YES.equals(exit) || exit.equals("")){
            System.out.println("Введите ифнормацию о кандидате (для заврешения введите пустую строку):\n" +
                    "  Фамилия Имя Отчество, пол, возраст, релевантность резюме, оценка на собеседовании:\n");
            input =  scanner.nextLine();
            String[] massPerson = input.toLowerCase().replaceAll("\\p{P}", "").split(" ");

            if(massPerson.length == 7 ) {
                candidates.add(new Candidate(massPerson[0] + " " + massPerson[1] + " " + massPerson[2]
                        , massPerson[3], massPerson[4], Integer.parseInt(massPerson[5])
                        , Integer.parseInt(massPerson[6])));
            } else {
                System.out.println("Что-то пошло не так. Не удалось распознать все введенные значения!");
            }

            System.out.print("\nХотите выйти? (\"Д\" и Enter): ");
            exit = scanner.nextLine();
        }
    }
}