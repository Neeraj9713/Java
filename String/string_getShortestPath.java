public class string_getShortestPath {

    public static float getShortestPath(String path){
        int x = 0, y = 0;
        
        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);

            //South
            if(dir=='S'){
                y--;
            }
            //Nort
            else if(dir=='N'){
                y++;
            }
            //West
            else if(dir=='W'){
                x--;
            }
            //East
            else{
                x++;
            }
        }

        int X1 = x*x;
        int Y1 = y*y;
        return (float)Math.sqrt(X1+Y1);
    }

    public static void main(String[] args) {
        String path ="WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
    
}
