package pr11;

import pr11.Complex;

public interface ComplexAbstractFactory
{
    Complex createComplex();
    Complex CreateComplex(int real, int image);
}