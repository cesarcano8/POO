//TALLER DE CESAR CANO
public class Taller{

    public static void main(String[] args){
        double d1 = 42.0;
        double d2 = 58.5;
        double d3 = 37.2;

        double t1 = 0.9; 
        double t2 = 1.4; 
        double t3 = 0.8;

        double l1 = 5.1;
        double l2 = 6.9;
        double l3 = 4.3;
        
        double precioLitro = 1.35; 
        double masaCargaKg = 1200;
        double largo = 2.0;
        double ancho = 1.2; 
        double alto = 1.1;

        double p1 = 2.5;
        double p2 = 3.0;
        double p3 = 2.0;

        double deprecPorKm = 0.08;
        double volCamionM3 = 10.0;
        double fCO2 = 2.68;
        double galPorLitro = 0.264172;
        double vmin = 30;
        double vmax = 90;
        double va = 40;
        double vb = 80;
        double ca = 0.05;
        double cb = 0.09;
        double a = -0.0008;
        double b = 0.08;
        double c = 4.0;

        double v1 = 0;
        double v2 = 0;
        double v3 = 0;

        double vProm = 0;

        double kmlV = 0;
        double kml1 = 0;
        double kml2 = 0;
        double kml3 = 0;
        double kmltotal = 0;

        double costoComb = 0;
        double deprec = 0;
        double peajes = 0;
        double costoDirecto = 0;
        double costoPorkm = 0;
        double volumen = 0;
        double densidad = 0;
        double ocupacion = 0;
        double COTotal = 0;
        double COporKm = 0;
        double vProm_ms = 0;
        double galTot = 0;
        double vmedia = 0; 
        double vpond_t = 0;
        double o = 0;
        double vnorm = 0;
        double cvprom = 0;
        double costoMant = 0;
        double kmlModelo = 0;
        double litrosModelo = 0;
        double score = 0;

        double w1 = 0.25;
        double w2 = 0.25;
        double w3 = 0.25;
        double w4 = 0.25;

        //EJERCICIO 1
        System.out.println("d1: " + d1 + " d2: " + d2 + " d3: " + d3);
        System.out.println("t1: " + t1 + " t2: " + t2 + " t3: " + t3);
        System.out.println("l1: " + l1 + " l2: " + l2 + " l3: " + l3 + "\n");
        System.out.println("Precio litro: "+precioLitro);
        System.out.println("MasaCargaKg: "+masaCargaKg);
        System.out.println("Largo: " + largo);
        System.out.println("Ancho: " + ancho);
        System.out.println("Alto: " + alto + "\n");
        System.out.println("p1: " + p1 + " p2: " + p2 + " p3: " + p3 + "\n");
        System.out.println("DeprecPorKm: " + deprecPorKm);
        System.out.println("VolCamionM3: " + volCamionM3);
        System.out.println("fCO2: " + fCO2);
        System.out.println("galPorLitro: " + galPorLitro);
        System.out.println("vmin: " + vmin);
        System.out.println("vmax: " + vmax);
        System.out.println("va: " + va);
        System.out.println("vb: " + vb);
        System.out.println("ca: " + ca);
        System.out.println("cb: " + cb);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c + "\n");

        //EJERCICIO 2

        v1 = d1/t1; 
        v2 = d2/t2;
        v3 = d3/t3;

        vProm = (d1*v1 + d2*v2 + d3*v3)/(d1+ d2 +d3);
        
        kml1 = d1/l1;
        kml2 = d2/l2;
        kml3 = d3/l3;

        kmltotal = (d1 + d2 + d3)/(l1 + l2 + l3);

        System.out.println("v1: " + v1 + " v2: " + v2 + " v3: " + v3);
        System.out.println("vProm: " + vProm);
        System.out.println("kml1: " + kml1 + " kml2: " + kml2 + " kml3: " + kml3);
        System.out.println("kmltotal: " + kmltotal + "\n");

        //EJERCICIO 3

        costoComb = (l1+l2+l3)*precioLitro;
        deprec = (d1+d2+d3)*deprecPorKm;
        peajes = (p1+p2+p3);

        costoDirecto = (costoComb + deprec + peajes);
        costoPorkm = costoDirecto/(d1 + d2 + d3);

        System.out.println("costoComb: " + costoComb);
        System.out.println("deprec: "+ deprec);
        System.out.println("peajes: " + peajes);
        System.out.println("costoDirecto: " + costoDirecto);
        System.out.println("costoPorKm: "+ costoPorkm + "\n");

        //EJERCICIO 4

        volumen = (largo*ancho*alto);
        densidad = masaCargaKg/volumen;
        ocupacion = volumen/volCamionM3;

        System.out.println("volumen: " + volumen);
        System.out.println("densidad: " + densidad);
        System.out.println("ocupacion: " + ocupacion + "\n");
       
        //EJERCICIO 5

        COTotal = (l1+l2+l3)*fCO2;
        COporKm = COTotal/(d1+d2+d3);

        System.out.println("COTotal: " + COTotal);
        System.out.println("COporKm: " + COporKm + "\n");

        //EJERCICIO 6

        vProm_ms = vProm*(1000/3600);
        galTot = (l1+l2+l3)*galPorLitro;
        
        vnorm = (vProm-vmin)/(vmax-vmin);

        System.out.println("vProm_ms: " + vProm_ms);
        System.out.println("galTot: " + galTot);
        System.out.println("vnorm: " + vnorm + "\n");
       
        //EJERCICIO 7

        vmedia = (v1 + v2 + v3)/3;

        o = Math.sqrt((Math.pow((v1-vmedia), 2) + Math.pow((v2-vmedia), 2) + Math.pow((v3-vmedia), 2))/3);
        
        vpond_t = (t1*v1 + t2*v2 + t3*v3)/(t1+t2+t3);

        System.out.println("vmedia: " + vmedia);
        System.out.println("o: " + o);
        System.out.println("vpond_t: " + vpond_t + "\n");

        //EJERCICIO 8

        cvprom = ca + (cb - ca)*((vProm-va)/(vb-va));
        
        costoMant = cvprom*(d1 + d2 + d3);

        System.out.println("cvprom: "+ cvprom);
        System.out.println("costoMant: " + costoMant + "\n");


        //EJERCICIO 9

        kmlV = a * Math.pow((vProm), 2) + (b*vProm) + c;
        kmlModelo = kmlV;
        litrosModelo = (d1 + d2 + d3)/kmlModelo;

        System.out.println("kmlV: " + kmlV);
        System.out.println("kmlModelo: " + kmlModelo);
        System.out.println("litrosModelo: "+ litrosModelo + "\n");

        //EJERCICIO 10

        score = w1*(1/costoPorkm) + w2*kmltotal + w3*(1/COporKm) + w4*(1/(1+o));
        System.out.println("score: " + score);
    }
}