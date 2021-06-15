package fabricacamisetas;

/**
 *
 * @author Fabricio
 */
public class FabricaCamisetas {

    public static void main(String[] args) {
        fabricaCamisas FcamisasKA = new FabricaKappa();
        FactoryCamisas fKappa = FcamisasKA.criarCamisetas("Vasco");
        fKappa.exibirInformacao();
        
        fabricaCamisas FcamisasUM = new FabricaUmbro();
        FactoryCamisas fUmbro = FcamisasUM.criarCamisetas("Fluminense");
        fUmbro.exibirInformacao();
        
        fabricaCamisas FcamisasAD = new FabricaAdidas();
        FactoryCamisas fAdidas = FcamisasAD.criarCamisetas("Flamengo");
        fAdidas.exibirInformacao();
     
        fabricaCamisas FcamisasNi = new FabricaNike()  ;
        FactoryCamisas fNike = FcamisasNi.criarCamisetas("Brasil");
        fNike.exibirInformacao();
        
        fabricaCamisas FcamisasPU = new FabricaPuma();
        FactoryCamisas fPuma = FcamisasPU.criarCamisetas("Botafogo");
        fPuma.exibirInformacao();
    }
}
