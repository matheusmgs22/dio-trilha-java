package poo.interfacePoo.equipamentos.multifuncional;

import poo.interfacePoo.equipamentos.copiadora.Copiadora;
import poo.interfacePoo.equipamentos.digitalizadora.Digitalizadora;
import poo.interfacePoo.equipamentos.impressora.Impressora;

public class EquipamentoMuntifucional implements Copiadora, Digitalizadora, Impressora {

    @Override
    public void copiar() {
        System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

    @Override
    public void digitalizar() {
        System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

}
