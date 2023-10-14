public class StudentMain {

    public static void main(String[] args) {

        for (int i = 0; i <= 4; i++) {
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i) {
                        case 0 -> "Mary";
                        case 1 -> "Carol";
                        case 2 -> "Tim";
                        case 3 -> "Harry";
                        case 4 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java Masterclass");
            System.out.println(s);
        }

        Student pojoStudent = new Student("S923006", "Ann", "05/11/1985", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S923007", "Bill", "05/11/1985", "Java Masterclass");

        System.out.println((pojoStudent));
        System.out.println((recordStudent));

//        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
//        System.out.println(pojoStudent.name() + " is taking " + pojoStudent.classList());
    }


}

