package poo.interfacePoo.equipamentos;

import poo.interfacePoo.equipamentos.copiadora.Copiadora;
import poo.interfacePoo.equipamentos.digitalizadora.Digitalizadora;
import poo.interfacePoo.equipamentos.digitalizadora.Scanner;
import poo.interfacePoo.equipamentos.impressora.Impressora;
import poo.interfacePoo.equipamentos.multifuncional.EquipamentoMuntifucional;

public class Fabrica {
    public static void main(String[] args) {

        Scanner deskjet = new Scanner();

        EquipamentoMuntifucional em = new EquipamentoMuntifucional();
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
