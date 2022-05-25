
/* This class encapsulates a list of movies in a user's collection.
 * The list is implemented as an array of type Movie. 
 * Each movie is represented by an instance of the Movie class.
*/
public class MovieList {
   //Class member variable declarations:
   private int initialLength;
   private Movie[] movieList;
   private int numMovies;
        // TODO: Put your declarations here.


   /* Constructor that initializes the member variables. The array is 
   *  created using the initial length passed in to the constructor.
   *  The initialLength is assigned to the initial length passed in to the constructor.
   *  The numMovies is initialized to 0.
   *  Any other member variables are initialized as well.
   */    
   public MovieList(int initialLen){
      initialLength = initialLen;
      movieList = new Movie[initialLength];
      numMovies = 0;
       // TODO: Implement this method.
   }
   
   /* Add the newMovie passed in to the next available cell in the movieList.
    * Available (empty) cells have the value NULL. The numMovies variable may be used
    * to keep track of the index of the next available cell.
    * For example, if the list contained: item1, item2, NULL, NULL,
    * the next available cell is at index 2.
   */
   public void addMovie(Movie newMovie){
      if (isFull()) {
         movieList = expandList(movieList);
         movieList [numMovies] = newMovie;
         numMovies++;
      }
      else {
         movieList[numMovies] = newMovie;
         numMovies++;
      }
       // TODO: Implement this method. 
   }

  /* This method returns an array that contains only Movie objects whose 
   * title matches the targetTitle passed in.
   * The array returned does not contain any NULL values.
   * This method returns an array of length 0 if there are no matches.
   * This method may call the getOnlyItems method.
   */   
   public Movie[] findMoviesByTitle(String targetTitle){
      Movie[] a_a_ron = new Movie[movieList.length];
      int numCounter = 0;
      int a = 0;
      while (a<movieList.length) {
         if (movieList[a].getTitle().equals(targetTitle)){
            a_a_ron[a] = movieList[a];
            numCounter++;
         }
         a++;
      }
       // TODO: Implement this method.
       return getOnlyItems(a_a_ron,numCounter);    
   }
   
  /* This method returns an array that contains only Movie objects whose 
   * genre matches the targetGenre passed in.
   * The array returned does not contain any NULL values.
   * This method returns an array of length 0 if there are no matches.
   * This method may call the getOnlyItems method.
   */   
   public Movie[] findMoviesByGenre(String targetGenre){
      Movie[] j_quell_in = new Movie[movieList.length];
      int numCounter = 0;
      for (int b = 0; b<movieList.length;b++){
         if(movieList[b].getGenre().equals(targetGenre)){
            j_quell_in[b] = movieList[b];
            numCounter++;
         }
      }
      // TODO: Implement this method.
      return getOnlyItems(j_quell_in,numCounter);   
   }
   
  /* This method returns an array of all of the Movie objects that are 
   * stored in the movieList. The array returned does not contain any NULL 
   * values. This method returns an array of length 0 if the movieList is empty.
   * This method may call the getOnlyItems method
   */
   public Movie[] getMovieListAsArray(){
   // TODO: Implement this method.
      return getOnlyItems(movieList,numMovies);
   }
    
    /* Returns the number of Movies stored in the movieList. 
    */
    public int getNumMovies(){
    // TODO: Implement this method.
        return this.numMovies;
    }
    
   /* Returns true if the movieList contains no Movies, false otherwise.
    */
   public boolean isEmpty(){
   // TODO: Implement this method.
      int movies = 0;
      for (int c = 0; c<movieList.length; c++){
         if(movieList[c] == null)
            movies++;
      }
      if (movies == movieList.length){
         return true;
      }
      else {
         return false;
      }
      
   }
  
    /****** Private, "helper" method section ******/
   
   /* Creates a new array that is double the size of the array passed in, copies the data 
    * from that array to the new array, and returns the new array. 
    * Note that the new array will contain the Movies from the previous array followed by NULL values.
    */
    private Movie[] expandList(Movie[] inputList){
      // TODO: Implement this method.
      Movie [] ti_mo_thy = new Movie[inputList.length*2];
      for(int d = 0;d<inputList.length;d++)
         ti_mo_thy[d] = movieList[d];
      return ti_mo_thy;
    }
    
   /* A full Movie list is an array where all cells contain a Movie. That
    * means there is no cell that contains NULL.
    * This method returns true if all cells in the array contain a Movie
    * object, false otherwise. 
    */
    private boolean isFull(){
      boolean ba_la_ke = true;
      int e = 0;
      while (e<movieList.length){
         if(movieList[e] == null){
            ba_la_ke = false;
         }
         e++;
      }
      
    // TODO: Implement this method.
      return ba_la_ke;
    }
    
    /*
    * This method takes an array of Movies as an input as well as
    * the number of Movies on that array. The inputArray may contain 
    * some NULL values.
    * This method returns an array that contains only the Movies in 
    * the input array and no NULL values.
    * It returns an array of length 0 if there are no Movies in the input array.
    */
    private Movie[] getOnlyItems(Movie[] inputArray, int size){
      // TODO: Implement this method.
      Movie[] space = new Movie[size];
      for(int f=0;f<inputArray.length;f++){
         for(int z=0; z<space.length;z++){
            if(inputArray[z] != null) {
               space[z] = inputArray[z];
               break;
            }
         }
      }
      return space;    
    }
}