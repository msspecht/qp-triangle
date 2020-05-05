import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest
{
    @Test
    public void testEscaleno()
    {
        int actual = App.identificaTriangulo(2, 3, 4);
        int expected = tipos.ESCALENO.value();
        assertEquals(expected, actual);
    }
    @Test
    public void testEquilatero()
    {
        int actual = App.identificaTriangulo(5, 5, 5);
        int expected = tipos.EQUILATERO.value();
        assertEquals(expected, actual);
    }
    @Test
    public void testIsosceles()
    {
        int actual = App.identificaTriangulo(6, 6, 7);
        int expected = tipos.ISOSCELES.value();
        assertEquals(expected, actual);
    }
    @Test
    public void testIsoscelesVariante3_1()
    {
        int actual = App.identificaTriangulo(6, 7, 6);
        int expected = tipos.ISOSCELES.value();
        assertEquals(expected, actual);
    }
    @Test
    public void testIsoscelesVariante3_2()
    {
        int actual = App.identificaTriangulo(7, 6, 6);
        int expected = tipos.ISOSCELES.value();
        assertEquals(expected, actual);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidoZero() throws IllegalArgumentException
    {
        int actual = App.identificaTriangulo(8, 0, 9);
        String expect = "Entrada Inválida";
    }
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidoNegativo() throws IllegalArgumentException
    {
        int actual = App.identificaTriangulo(2, 3, -4);
        String expect = "Entrada Inválida";
    }
    @Test(expected = IllegalArgumentException.class)
    public void testNaoTriangulo()
    {
        int actual = App.identificaTriangulo(1, 2, 3);
        String expect = "Não é triângulo";
    }

    @Test(expected = IllegalArgumentException.class)
    public void testVariantes7_1()
    {
        int actual = App.identificaTriangulo(1, 3, 2);
        String expect = "Não é triângulo";
    }

    @Test(expected = IllegalArgumentException.class)
    public void testVariantes7_2()
    {
        int actual = App.identificaTriangulo(3, 1, 2);
        String expect = "Não é triângulo";
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLinhaLonga()
    {
        int actual = App.identificaTriangulo(1, 2, 8);
        String expect = "Não é triângulo";
    }

    @Test(expected = IllegalArgumentException.class)
    public void testVariantes9()
    {
        int actual = App.identificaTriangulo(8, 1, 2);
        String expect = "Não é triângulo";
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTodosZero()
    {
        int actual = App.identificaTriangulo(0, 0, 0);
        String expect = "Não é triângulo";
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNumerosReais()
    {
        int actual = App.identificaTriangulo(1/2, 3/4, 5);
        String expect = "Entrada inválida";
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNoParamInvalido()
    {
        int actual = App.identificaTriangulo(7, 8);
        String expect = "Entrada inválida";
    }
}