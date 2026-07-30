class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> sublist = new ArrayList<>();
        int length = s.length();
        getAllparts(result,sublist,s);
        return(result);        
    }
    public void getAllparts(List<List<String>> result,List<String> sublist,String s){
        if(s.length()==0){
            result.add(new ArrayList<>(sublist));
            return;
        }

        for(int i=0;i<s.length();i++){
            String part=s.substring(0,i+1);
            if(isPalin(part)){
                sublist.add(part);
                getAllparts(result,sublist,s.substring(i+1));
                sublist.remove(sublist.size()-1);
            }
        }
    }
    public boolean isPalin(String s){
        int l=s.length();
        for(int i=0;i<l/2;i++){
            if(s.charAt(i) != s.charAt(l-i-1))
            {
                return false;
            }
        }
        return true;
    }
}
