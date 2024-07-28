class StringBuf{
    public static void main(String args[]){
        StringBuffer obj = new StringBuffer();
        String a = "jishnu";
        String b = "js";
        try{
            obj.append(a);
            System.out.println(a);
            int n = obj.length();
            obj.insert(n,b);
            System.out.println(obj);
            System.out.println(obj.reverse());
            System.out.println(obj);
            obj.delete(0,obj.length());
            System.out.println(obj);
            obj.append("Hello");
            obj.append("World");
            System.out.println(obj);
            obj.insert(5,"Java");
            System.out.println(obj);
            char c = obj.charAt(4);
            obj.setCharAt(5,"v");   
            obj.substring(2,5);
            obj.deleteCharAt(7);
            obj.capacity();
            obj.delete(3,obj.length());
        }catch(StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}