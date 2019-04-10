package com.larger;

public class Test {


    public static void main(String[] args) {
    	  long currentTimeMillis = System.currentTimeMillis();
//        Upper.display();
//
//
//        ArrayList<Student> studentArrayList=new ArrayList<>();
//
//
//        studentArrayList.add(new Student("faisal",8082081607l));
//        studentArrayList.add(new Student("bhavik",8082081608l));
//        studentArrayList.add(new Student("faisal",8082081609l));
//
//        studentArrayList.forEach(new Consumer<Student>() {
//            @Override
//            public void accept(Student student) {
//                student.setMobileNo(Long.parseLong("91"+student.getMobileNo()));
//            }
//        });
//
//
//        studentArrayList.forEach(student -> {
//            System.out.println("new number");
//            System.out.println(student.getMobileNo());
//
//        });
//
        String s1 = "I love java. And Java is programming language.x love java.ove java.ove java. love java.ove java.ove java.I love java. And Java is programming language.x love java.ove java.ove java. love java.ove java.ove java.I love java. And Java is ";
        String s2 = "I love java. And Java is programming language.x love java.ove java.ove java. love java.ove java.ove java.I love java. And Java is programming language.x love java.ove java.ove java. love java.ove java.ove java.I love java. And Java is I love java. And Java is programming language.x love java.ove java.ove java. love java.ove java.ove java.I love java. And Java is programming language.x love java.ove java.ove java. love java.ove java.ove java.I love java. And Java is ";

//        String s1 = "I love java. And java is programming language.";
//        String s2 = "java is programming language. So i love java.";

//        String s1 = "I love java";
//        String s2 = "I love java";

//        String s1 = "11221112113 2111211321112113 2  1112113 2 ";
//        String s2 = "1122  1112113 2111211321112113 2 ";

//        String s1 = "I  Love java";
//        String s2 = "I Love java";

//        String s1="Some times i just love coding";
//        String s2="I love coding. So sometime i just love coding";

//        String s1="java is best to test your skill";
//        String s2="i gave java test. And it was best";

      
        LowestLargestString stringData = LowestLargestString.getResult(s1, s2);
        LargestContinueStringFinder stringFinder = LargestContinueStringFinder.getInstance();
        String longestString = stringFinder.find(stringData);
        System.out.println(longestString);
        System.out.println(System.currentTimeMillis()-currentTimeMillis);

    }


}

