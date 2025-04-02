package person;

// Más que "Person", "Player" :)
// No mezcles español con inglés: o español o inglés.
public class Person {

    String name;
    int numberOfBrooms;
    boolean moreGold;
    boolean allTheGolds;
    boolean majorityOfSevens;
    boolean sieteDeOros;
    boolean mayoriaCartas;
    boolean competidorMenosDeDiezCartas;

    public Person(String nombre, int numeroEscobas, boolean masOros, boolean todosLosOros, boolean mayoriaDeSietes, boolean sieteDeOros, boolean mayoriaCartas, boolean competidorMenosDeDiezCartas) {
        this.name = nombre;
        this.numberOfBrooms = numeroEscobas;
        this.moreGold = masOros;
        this.allTheGolds = todosLosOros;
        this.majorityOfSevens = mayoriaDeSietes;
        this.sieteDeOros = sieteDeOros;
        this.mayoriaCartas = mayoriaCartas;
        this.competidorMenosDeDiezCartas = competidorMenosDeDiezCartas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfBrooms() {
        return numberOfBrooms;
    }

    public void setNumberOfBrooms(int numberOfBrooms) {
        this.numberOfBrooms = numberOfBrooms;
    }

    public boolean isMoreGold() {
        return moreGold;
    }

    public void setMoreGold(boolean moreGold) {
        this.moreGold = moreGold;
    }

    public boolean isAllTheGolds() {
        return allTheGolds;
    }

    public void setAllTheGolds(boolean allTheGolds) {
        this.allTheGolds = allTheGolds;
    }

    public boolean isMajorityOfSevens() {
        return majorityOfSevens;
    }

    public void setMajorityOfSevens(boolean majorityOfSevens) {
        this.majorityOfSevens = majorityOfSevens;
    }

    public boolean isSieteDeOros() {
        return sieteDeOros;
    }

    public void setSieteDeOros(boolean sieteDeOros) {
        this.sieteDeOros = sieteDeOros;
    }

    public boolean isMayoriaCartas() {
        return mayoriaCartas;
    }

    public void setMayoriaCartas(boolean mayoriaCartas) {
        this.mayoriaCartas = mayoriaCartas;
    }

    public boolean isCompetidorMenosDeDiezCartas() {
        return competidorMenosDeDiezCartas;
    }

    public void setCompetidorMenosDeDiezCartas(boolean competidorMenosDeDiezCartas) {
        this.competidorMenosDeDiezCartas = competidorMenosDeDiezCartas;
    }
}
