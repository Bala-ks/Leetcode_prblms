class Solution {
    public boolean isNumber(String s) {
        if(s.contains("Infinity"))    return false;
         if (s.endsWith("f") || s.endsWith("F"))    return false;
          if (s.endsWith("d") || s.endsWith("D"))   return false;
        
        try {
            double d = Double.parseDouble(s);  
            return true;
        } 
        catch (NumberFormatException e) {
            return false;
        }
        
    }
}