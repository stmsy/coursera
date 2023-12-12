public class Poker {
    public static int NUM_CARDS = 5;
    public static int NUM_HANDS = 5;
    public static int NUM_SUITS = 4;
    public static int NUM_RANKS = 13;
    public static int[] suits = {1, 2, 3, 4};  // 1: Club, 2: Diamond, 3: Heart, 4: Spade
    public static int[] ranks = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

    public static int[] drawCard() {
        int suit = suits[StdRandom.uniformInt(NUM_SUITS)];
        int rank = ranks[StdRandom.uniformInt(NUM_RANKS)];
        int[] card = {suit, rank};
        return card;
    }

    public static int[][] drawCards() {
        int[][] hand = new int[NUM_CARDS][2];
        for (int j = 0; j < NUM_CARDS; j++) {
            int[] card = drawCard();
            hand[j] = card;
        }
        return hand;
    }

    public static int[] countSuits(int[][] hand) {
        int[] suitCounts = new int[NUM_SUITS+1];
        for (int i = 0; i < NUM_CARDS; i++) suitCounts[hand[i][0]]++;
        return suitCounts;
    }

    public static int[] countRanks(int[][] hand) {
        int[] rankCounts = new int[NUM_RANKS+1];
        for (int i = 0; i < NUM_CARDS; i++) rankCounts[hand[i][1]]++;
        return rankCounts;
    }

    public static int countPairs(int[] rankCounts) {
        int pairCounts = 0;
        for (int i = 1; i <= NUM_RANKS; i++) {
            if (rankCounts[i] == 2) pairCounts++;
        }
        return pairCounts;
    }

    public static boolean areAllSameSuits(int[][] hand) {
        int[] suitCounts = countSuits(hand);
        for (int i = 1; i <= NUM_SUITS; i++) {
            if (suitCounts[i] == 5) return true;
        }
        return false;
    }

    public static boolean isSequential(int[][] hand) {
        int[] rankCounts = countRanks(hand);
        for (int i = 1; i <= NUM_RANKS-4; i++) {
            if (rankCounts[i] == 1) {
                int seqCount = 1;
                for (int j = 1; j < NUM_CARDS; j++) {
                    if (rankCounts[i+j] == 1) seqCount++;
                }
                if (seqCount == NUM_CARDS) return true;
            }
        }
        return false;
    }

    public static boolean isOnePair(int[][] hand) {
        int[] rankCounts = countRanks(hand);
        int pairCounts = countPairs(rankCounts);
        if (pairCounts == 1) return true;
        return false;
    }

    public static boolean isTwoPair(int[][] hand) {
        int[] rankCounts = countRanks(hand);
        int pairCounts = countPairs(rankCounts);
        if (pairCounts == 2) return true;
        return false;
    }

    public static boolean isThreeOfAKind(int[][] hand) {
        int[] rankCounts = countRanks(hand);
        for (int i = 1; i <= NUM_RANKS; i++) {
            if (rankCounts[i] == 3 && !isOnePair(hand)) return true;
        }
        return false;
    }

    public static boolean isAFullHouse(int[][] hand) {
        int[] rankCounts = countRanks(hand);
        for (int i = 1; i <= NUM_RANKS; i++) {
            if (rankCounts[i] == 3 && isOnePair(hand)) return true;
        }
        return false;
    }

    public static boolean isAFlush(int[][] hand) {
        if (areAllSameSuits(hand) && isSequential(hand)) return true;
        return false;
    }

    public static void main(String[] args) {
        // Define number of trials
        int num_trials = Integer.parseInt(args[0]);

        // For earch trial, draw five cards from deck
        double[] hands = new double[NUM_HANDS];
        for (int i = 0; i < num_trials; i++) {
            int[][] hand = drawCards();
            if (isOnePair(hand)) hands[0]++;  // 0: one pair
            if (isTwoPair(hand)) hands[1]++;  // 1: two pair
            if (isThreeOfAKind(hand)) hands[2]++;  // 2: three of a king
            if (isAFullHouse(hand)) hands[3]++;  // 3: a full house
            if (isAFlush(hand)) hands[4]++;  // 4: a flush
        }

        // Compute relative frequencies of hands
        for (int i = 0; i < NUM_HANDS; i++) hands[i] /= num_trials;

        StdArrayIO.print(hands);
    }
}
