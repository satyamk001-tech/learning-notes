public class Solution {
    public static boolean robotBacktozero(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
        char dir = path.charAt(i);

            if(dir == 'D'){
                y--;
            }
            else if(dir == 'U'){
                y++;
            }
            else if(dir == 'L'){
                x--;
            }
            else if(dir == 'R'){
                x++;
            }   
        }
        //check if robot returned to origin
        return x==0 && y==0;
    }
    public static void main(String args[]){
        String path="UD";
        System.out.println(robotBacktozero(path));
    }
}
