public class StudentInfo {

   private int no;
   private String name;
   private int korScore;
   private int engScore;
   private int mathScore;
   private int total;
   private double average;
   private int rank;

   static int numOfStudent = 0;

   StudentInfo() {
      no = numOfStudent++;
   }

   StudentInfo (String name, int korScore, int engScore, int mathScore) {
      no = numOfStudent++;
      this.name = name;
      this.korScore = korScore;
      this.engScore = engScore;
      this.mathScore = mathScore;
      total = korScore + engScore + mathScore;
      average = total / 3.0;
      //this.rank = rank; // setRank에서 처리.
   }

   public int getNo() {
      return no;
   }
   
   public String getName() {
      return name;
   }

   public int getKorScore() {
      return korScore;
   }

   public int getEngScore() {
      return engScore;
   }

   public int getMathScore() {
      return mathScore;
   }

   public int getToTal() {
      return total;
   }   
   
   public double getAverage() {
      return average;
   }

   public int getRank() {
	   return rank;
   }

   public void setRank(int _rank) {
		this.rank = _rank;
   }

   public static int getNumberOfStudent() {
		return numOfStudent;
   }
   
}