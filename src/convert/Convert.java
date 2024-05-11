package convert;

public class Convert {
    final double WIDTH_IN_INCHES = 8.5;
    final double HEIGHT_IN_INCHES = 11.0;

    public double width(){
        return WIDTH_IN_INCHES * Constants.INCH_TO_MM;
    }
    public double height(){
        return HEIGHT_IN_INCHES * Constants.INCH_TO_MM;
    }

    public double getPerimeter(){
        double addition = width() + height();
        return  2 * addition;
    }

}
