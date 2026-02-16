/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.tecnm.cdmadero.formulaecuacion2dogrado;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 *
 * @author Fernando Manzanares
 */
public class EcuacionDe2doGrado {
    
    BigDecimal a;
    BigDecimal b;
    BigDecimal c;

    static BigDecimal dos = new BigDecimal("2");
    static BigDecimal cuatro = new BigDecimal("4");
    
    public EcuacionDe2doGrado(BigDecimal a, BigDecimal b, BigDecimal c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    BigDecimal getY(BigDecimal x) {
        return this.a.multiply(x.pow(2)).add(this.b.multiply(x)).add(this.c);
    }

    BigDecimal getX1() {
        MathContext mc = new MathContext(4, RoundingMode.HALF_UP);
        BigDecimal radicando = b.multiply(b).subtract(cuatro.multiply(a).multiply(c));
        return  b.negate().add(radicando.sqrt(mc)).divide(dos.multiply(a));
    }

    BigDecimal getX2() {
        MathContext mc = new MathContext(4, RoundingMode.HALF_UP);
        BigDecimal radicando = b.multiply(b).subtract(cuatro.multiply(a).multiply(c));
        return  b.negate().subtract(radicando.sqrt(mc)).divide(dos.multiply(a));
    }
}
