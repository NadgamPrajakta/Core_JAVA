package propagationofexception;

class InvalidMovieException extends Exception {
	
    int code;
    
    public InvalidMovieException(String str, int code, Throwable t) {
    	
        super(str, t);
        this.code = code;
    }
    
    public int getCode() { 
    	return this.code; }
}

class SeatNotAvailableException extends Exception {
	
    int code;
    
    public SeatNotAvailableException(String str, int code, Throwable t) {
    	
        super(str, t);
        this.code = code;
    }
    public int getCode() { 
    	return this.code; }
}

//class InvalidPaymentException extends Exception {
//	
//    int code;
//    
//    public InvalidPaymentException(String str, int code, Throwable t) {
//    	
//        super(str, t);
//        this.code = code;
//    }
//    public int getCode() { 
//    	return this.code; }
//}


class AgeRestrictionException extends Exception {

    int code;
    
    public AgeRestrictionException(String str, int code, Throwable t) {
    	
        super(str, t);
        this.code = code;
    }
    public int getCode() {
    	return this.code; }
}

class NetworkErrorException extends Exception {
	
    int code;
    
    public NetworkErrorException(String str, int code, Throwable t) {
    	
        super(str, t);
        this.code = code;
    }
    public int getCode() {
    	return this.code; }
}


