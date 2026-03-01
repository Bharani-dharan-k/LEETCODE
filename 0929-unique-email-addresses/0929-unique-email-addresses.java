class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
      for (String email : emails) {
            int atPos = email.indexOf('@');
            String localname = email.substring(0, atPos);
            String domainname = email.substring(atPos);
            localname = localname.replace(".", "");
            if (localname.contains("+")) {
                int plusPos = localname.indexOf("+");
                localname = localname.substring(0, plusPos);
            }
            String newemail = localname + domainname;
            set.add(newemail);
        }
        return set.size();
    }
}