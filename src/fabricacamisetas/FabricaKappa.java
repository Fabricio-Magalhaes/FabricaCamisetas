package fabricacamisetas;

/**
 *
 * @author Fabricio
 */
public class FabricaKappa extends fabricaCamisas{

    @Override
    public FactoryCamisas criarCamisetas(String modelo) {
        if (modelo.equals("Vasco")) {
            return new Vasco();
        }
        return null;
    }
}
