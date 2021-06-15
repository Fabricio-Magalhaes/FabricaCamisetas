package fabricacamisetas;

/**
 *
 * @author Fabricio
 */
public class FabricaPuma extends fabricaCamisas {

    @Override
    public FactoryCamisas criarCamisetas(String modelo) {
        if (modelo.equals("Botafogo")) {
            return new Botafogo();
        }
        return null;
    }

}
