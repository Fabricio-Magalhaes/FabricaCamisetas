package fabricacamisetas;

/**
 *
 * @author Fabricio
 */
public class FabricaNike extends fabricaCamisas {

    @Override
    public FactoryCamisas criarCamisetas(String modelo) {
        if (modelo.equals("Brasil")) {
            return new Brasil();
        }
        return null;
    }

}
