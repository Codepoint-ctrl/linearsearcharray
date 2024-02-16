public class linearSearch {

    public static int linearsurch(int number [] , int key ){
         for( int i =0; i<number.length ; i++){
             if (number[i] == key ){
                return i;
             }
         }
         return -1;
    } 
  public static void main(String[] args) {

     int number[] = { 2 ,3,4,5,6,7,9,10 ,11 ,12,13,15,15};
     int key = 10 ; 
      int index = linearsurch(number , key);
       if ( index == -1){
         System.out.println( " NOT FOUND");
       } else{
         System.out.println("KEY IS AT INDEX " + index);
       }
   

  }
}
