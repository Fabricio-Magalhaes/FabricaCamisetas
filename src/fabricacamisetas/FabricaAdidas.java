package fabricacamisetas;

/**
 *
 * @author Fabricio
 */
public class FabricaAdidas extends fabricaCamisas {

    @Override
    public FactoryCamisas criarCamisetas(String modelo) {
        if (modelo.equals("Flamengo")) {
            return new Flamengo();
        }
        return null;
    }

}
