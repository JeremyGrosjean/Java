package com.freestack.centralenantes.exed.tutorials.d_collections;

import com.freestack.centralenantes.exed.tutorials.c_book.Chapter;

import java.util.*;

public class Bookbuilder {

    public static void main(String[] args) {

        String text = "Friar Laurence?: Two households, both alike in dignity\n" +
                "In fair Verona, where we lay our scene\n" +
                "From ancient grudge break to new mutiny\n" +
                "Where civil blood makes civil hands unclean.\n" +
                "From forth the fatal loins of these two foes\n" +
                "A pair of star-crossed lovers take their life\n" +
                "Whose misadventured piteous overthrows\n" +
                "Do with their death bury their parents strife\n" +
                "The fearful passage of their death marked love\n" +
                "And the continuance of their parents? rage\n" +
                "Which but their childrens? end, nought could remove\n" +
                "Is now the two hour?s traffic of our stage\n" +
                "The which if you with patient ears attend\n" +
                "What here shall miss, our toil shall strive to mend.";

        List<Chapter> book = new ArrayList<>();
        book.add(new Chapter("Who is Richard Feynman", "Richard Feynman is considered to be one of the most miraculous personalities in scientific history. The 1965 Nobel prize winner on QED (along with J. Schwinger and Tomonaga), Dr. Feynman was a remarkably amazing educator and a great physicist. Feynman, along with many other contributions to science, had created a mathematical theory that accounts for the phenomenon of superfluidity in liquid helium. Thereafter, he had fundamental contributions (along with Murray Gell-Mann) to weak interactions such as beta decay. In his later years, Feynman played a significant role in the development of quark theory by putting forward his Parton model of high energy proton collision processes. He also introduced basic new computational techniques and notations into physics. Besides being a physicist, he was at various times repairer of radios, a picker of locks, an artist, a dancer, a bongo player, a great teacher, and a showman who successfully demonstrated the cause of the 1986 Challenger Shuttle Disaster as part of the Roger’s Commission."));
        book.add(new Chapter("History", "The genius of Richard Feynman in evident from his three-volume books on physics called The Feynman Lectures on Physics, which are based on his lectures at Caltech during 1961–1963. In his teenage years, Richard Feynman’s high school did not offer any courses on calculus. As a high-school teenager, he decided to teach himself calculus and read Calculus for the Practical Man."));
        book.add(new Chapter("Step 1", "This technique is applicable to pretty much any discipline or any subject and concept despite the fact that it says the Feynman technique, it is not just limited to math or physics and can be applied to a wide range of fields. The first step to use this technique is to choose the topic and start studying it. Now, studying doesn’t mean just memorizing the facts. In fact, Feynman himself was always against the culture of memorization and he always believed that one should learn and understand the principles rather than memorizing the facts or formulae. Another good method of studying something is to write. Writing something on a piece of paper stimulates the Hippocampus of your brain, the part which is primarily responsible for memory and learning."));
        book.add(new Chapter("Step 2", "Explain the concepts in your own words and try to explain it to a child or someone who is completely unfamiliar with the topic. You can also pretend to explain it to a rubber duck that in on your table. The idea is to try and break things down in as much simpler and plain language as possible. Try to use simple terms and vocabularies and don’t limit yourself to just the facts that you’ve learned. You may as well include an example or two to make things simpler or create your own example making sure that it is associated with the main idea. It becomes much easier for you to understand things at a deeper level if you do so and helps you make connections."));
        book.add(new Chapter("Step 3", "This is an extremely crucial step where you learn where you are lacking. As you are explaining or writing things in simple terms, you always come across certain areas where you are find it difficult to explain or make connections or formulate examples. This is the point where you get back to the resource material, the books or journals or internet, whatever your primary references are, and fill the gaps in your knowledge. You can identify your gaps by several instances, like not being able to explain something or simplify something, forgetting some important points and so on. The idea is to get back, and revise things once again. This helps you understand things even better. In this step, you know the areas that you need to work on and focus on which is a significant part of the learning process. Knowing one’s limitations and then working upon them to understand them better is the point of this step and it works like magic."));
        book.add(new Chapter("Step 4", "Here comes the product now. Once you have corrected your mistakes and straightened your difficulties, you simplify your explanation and make it better. You can always go back to Step-2 and Step-3 until you have a clear-cut understanding of the subject matter. Your notes and examples are now in the simplest form possible and you have a deeper understanding of the topic under study. You can follow this approach over and over again till you feel like you have mastered the concept.\nAfter your final explanation is ready, you can convey it to your colleagues or friends or professionals who are familiar with your field of expertise and reflect back upon your understanding of things. This Test-and-Learn method works wonders. Feynman always believed that the truth lies in simplicity and that things can be better understood when they are simple and elegant. It is much easier to overcomplicate things, which often shows the lack of deep understanding. The idea is to make things simple enough to be understood by anyone and then using that tool for deeper understanding for yourself. The Feynman technique of Learning helps you learn and understand things by a different perspective. It can be used not just for academic purposes but also for building businesses, creating startups, mental models, and many more. The Feynman Technique is a great method to develop mastery over pretty much set of information."));

        Tri tri = new Tri();

        // 1
        ArrayList<String> words;
        words = tri.createList(text);
        tri.orderList(words);
//        tri.printList(words);

        //2
        ArrayList<String> wordsbylength;
        wordsbylength = tri.listbylength(words, 2);
        tri.orderList(wordsbylength);
//        tri.printList(wordsbylength);

        //3
//        ArrayList<String> wordsUnique;
//        wordsUnique = tri.listUnique(words);
//        tri.orderList(wordsUnique);
////        tri.printList(wordsUnique);

        //4
        Map<String, Integer> analyzedWord = new HashMap<>();
//        tri.printList(words);
        analyzedWord = tri.analyzeList(words);
//        tri.printHashMap(analyzedWord);

        //5
//        Map<String, Integer> wordSelection = new HashMap<>();
//        ArrayList<String> wordlengthtwo= tri.listbylength(words, 2);
//        wordSelection = tri.analyzeList(wordlengthtwo);
//
//        tri.printHashMap(wordSelection);

        //6
        tri.idWord(words, book);

    }
}
