//Runtime/method overriding
class Mobile {
    public void feature() {
        System.out.println("Basic mobile feature");
    }
}


class Call extends Mobile {
    @Override
    public void feature() {
        System.out.println("You can make a Call ");
    }
}

class Game extends Mobile {
    @Override
    public void feature() {
        System.out.println("You can play Games ");
    }
}

class Gallery extends Mobile {
    @Override
    public void feature() {
        System.out.println("You can see Photos ");
    }
}

class Video extends Mobile {
    @Override
    public void feature() {
        System.out.println("You can watch Videos ");
    }
}

class Chat extends Mobile {
    @Override
    public void feature() {
        System.out.println("You can Chat");
    }
}



// Main class
 class Practice1 {
    public static void main(String[] args) {
        Mobile m=new Mobile();
        

        m = new Call();
        m.feature();

        m = new Game();
        m.feature();

        m = new Gallery();
        m.feature();

        m = new Video();
        m.feature();

        m = new Chat();
        m.feature();
    }
}
