public class RatingMethod4 {
    public static String rating (int totalSAT) {
        if (totalSAT < 400 || totalSAT > 1600) {
            throw new IllegalArgumentException("invalid total SAT score: " + totalSAT);
        } else if (totalSAT < 800) {
            return "not competitive";
        } else if (totalSAT >=  1200) {
            return "highly competitive";
        } else { // 800 <= totalSAT < 1200
            return "competitive";
        }
    }

    public static void main(String[] args) {
        String studentRating;
        int studentScore;

//        studentScore = 300;
//        studentRating = rating(studentScore);
//        System.out.println("Student Rating (" + studentScore + "): " + studentRating);
        studentScore = 400;
        studentRating = rating(studentScore);
        System.out.println("Student Rating (" + studentScore + "): " + studentRating);
        studentScore = 600;
        studentRating = rating(studentScore);
        System.out.println("Student Rating (" + studentScore + "): " + studentRating);
        studentScore = 800;
        studentRating = rating(studentScore);
        System.out.println("Student Rating (" + studentScore + "): " + studentRating);
        studentScore = 1200;
        studentRating = rating(studentScore);
        System.out.println("Student Rating (" + studentScore + "): " + studentRating);
        studentScore = 1600;
        studentRating = rating(studentScore);
        System.out.println("Student Rating (" + studentScore + "): " + studentRating);
//        studentScore = 1700;
//        studentRating = rating(studentScore);
//        System.out.println("Student Rating (" + studentScore + "): " + studentRating);

    }
}