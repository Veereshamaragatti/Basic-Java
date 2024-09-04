class first_string_uppercase{
    public static String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        StringBuilder result = new StringBuilder();
        for(String word: words){
            if(word.length()<=2){
                result.append(word.toLowerCase());
            }else{
                result.append(Character.toUpperCase(word.charAt(0)));
                result.append(word.substring(1).toLowerCase());
            }
            result.append(" ");
        }
        return result.toString().trim();
    }
    public static void main(String[] args){
        String title = "capiTalIze tHe titLe";
        String result = capitalizeTitle(title);
        System.out.println(result);
    }
}