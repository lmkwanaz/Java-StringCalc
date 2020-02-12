public class StringCal {

    public int add(String params){

        String[] str_plit = params.split(" ");

       if(params.length() != 0){
           if(params.length() == 1){
               System.out.println(params);
           }else{
               for(int i=0; i < params.length(); i++){
                   boolean check = params.
               }
               return 2;
           }

       }else {
           return 0;
       }
        
        return 0;
    }

    public static void main(String[] args){
        StringCal str = new StringCal();
        String str1 = "1,2";
        str.add(str1);
    }
}
