package fabricacamisetas;

/**
 *
 * @author Fabricio
 */
public class FabricaUmbro extends fabricaCamisas {

    @Override
    public FactoryCamisas criarCamisetas(String modelo) {
        if (modelo.equals("Fluminense")) {
            return new Fluminense();
        }
        return null;
    }
}
