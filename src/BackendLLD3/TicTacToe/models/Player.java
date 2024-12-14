package BackendLLD3.TicTacToe.models;

public class Player {
    private Integer id;
    private String name;
    private PlayerType playerType;
    private Symbol symbol;

    public Player(Integer id, String name, PlayerType playerType, Symbol symbol) {
        this.id = id;
        this.name = name;
        this.playerType = playerType;
        this.symbol = symbol;
    }

    private Player(PlayerBuilder playerBuilder) {
        this.id = playerBuilder.id;
        this.name = playerBuilder.name;
        this.playerType = playerBuilder.playerType;
        this.symbol = playerBuilder.symbol;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public PlayerBuilder getBuilder() {
        return new PlayerBuilder();
    }

    private static class PlayerBuilder {
        private Integer id;
        private String name;
        private PlayerType playerType;
        private Symbol symbol;

        public Integer getId() {
            return id;
        }

        public PlayerBuilder setId(Integer id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public PlayerBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlayerType getPlayerType() {
            return playerType;
        }

        public PlayerBuilder setPlayerType(PlayerType playerType) {
            this.playerType = playerType;
            return this;
        }

        public Symbol getSymbol() {
            return symbol;
        }

        public PlayerBuilder setSymbol(Symbol symbol) {
            this.symbol = symbol;
            return this;
        }

        public Player build() {
            return new Player(this);
        }
    }
}
