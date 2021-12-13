public class NameEncoderDecoder {
    public String encode(String name){
        String result = name.replace("e","1").replace("u","2").replace("i","3").replace("o","4").replace("a","5");
        String result2 = String.join("","NOTFORYOU",result,"YESNOTFORYOU");
        return result2;
    }
    public String decode(String name){
        String result = name.replace("1","e").replace("2","u").replace("3","i").replace("4","0").replace("5","a");
        String result2 = result.replaceFirst("NOTFORYOU","").replaceFirst("YESNOTFORYOU","");
        return result2;
    }
    public static void main(String[] args) {
    }
}