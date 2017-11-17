package com.codility.lesson;

import com.codility.lesson.lesson1.BinaryGapTest;
import com.codility.lesson.lesson2.CyclicRotationTest;
import com.codility.lesson.lesson2.OddOccurrencesInArrayTest;
import com.codility.lesson.lesson3.FrogJumpTest;
import com.codility.lesson.lesson3.PermutationMissingElementTest;
import com.codility.lesson.lesson3.TapeEquilibriumTest;
import com.codility.lesson.lesson4.PermutationCheckTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BinaryGapTest.class,
        CyclicRotationTest.class,
        OddOccurrencesInArrayTest.class,
        FrogJumpTest.class,
        PermutationMissingElementTest.class,
        TapeEquilibriumTest.class,
        PermutationCheckTest.class
})

public class CodilityTestSuite {
}
