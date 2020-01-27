package problem01;

class MyCoord{
    private int X;
    private int Y;

    public MyCoord() {
        this(0,0);
    }        
    public MyCoord(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }
    public int getX() {
        return X;
    }
    public int getY() {
        return Y;
    }
    public void setX(int X) {
        this.X = X;
    }
    public void setY(int Y) {
        this.Y = Y;
    }
    
    @Override
    public boolean equals(Object object){
    	if (object == null || getClass() != object.getClass()){
    		return false;
    	}
    	
    	MyCoord compared = (MyCoord) object;
    	if (this.X != compared.X || this.Y != compared.Y){
    		return false;
    	}
    	
    	return true;
    }
}