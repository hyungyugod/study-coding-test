class Solution {
    public String solution(String[] id_pw, String[][] db) {
    boolean id = false;
    boolean pw = false;

    for (int i = 0; i < db.length; i++){
        if (db[i][0].equals(id_pw[0])){
            id = true;
            if (db[i][1].equals(id_pw[1])){
                pw = true;
                break;
            }
        }
    }
    return id && pw ? "login" : (id ? "wrong pw" : "fail") ;
}
}