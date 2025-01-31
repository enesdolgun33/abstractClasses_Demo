class NegativeNumberException extends .....{
    public  NegativeNumberException(String message){
        ..................................
    }
}

public static double calculateSquareRoot(double number) ..................{
    if(number<0){
        ....... new ....................("Negatif sayıların karekökü alınamaz");
        }
    return Math.sqrt(number);
}