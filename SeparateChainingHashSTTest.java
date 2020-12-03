public class SeparateChainingHashSTTest {
    public static void main(String[] args) { 
        SeparateChainingHashST<String, Integer> st = new SeparateChainingHashST<String, Integer>();
        assert(st.isEmpty()==true);

        st.put("K",1);
        st.put("E",2);
        st.put("V",3);
        st.put("K",4);
        st.put("I",5);
        st.put("N",6);
        
        st.delete("I");

        assert(st.isEmpty() == false);
        assert(st.contains("K"));

        System.out.println(st.get("Z"));
        System.out.println(st.size());
        System.out.println(st.keys());
        
        System.out.println("All Test Cases Passed.");
    }

}
