package edu.berkeley.compbio.jlibsvm.oneclass;

import edu.berkeley.compbio.jlibsvm.regression.RegressionProblemImpl;

/**
 * @author <a href   <component name="libraryTable">
<library name="Maven: junit:junit:3.8.1">
<CLASSES>
<root url="jar://$MAVEN_REPOSITORY$/junit/junit/3.8.1/junit-3.8.1.jar!/" />
</CLASSES>
<JAVADOC>
<root url="jar://$MAVEN_REPOSITORY$/junit/junit/3.8.1/junit-3.8.1-javadoc.jar!/" />
</JAVADOC>
<SOURCES>
<root url="jar://$MAVEN_REPOSITORY$/junit/junit/3.8.1/junit-3.8.1-sources.jar!/" />
</SOURCES>
</library>
</component>private ScalingModelLearner<P> lastScalingModelLearner = null;
private OneClassProblemImpl<L, P> scaledCopy = null;

// --------------------------- CONSTRUCTORS ---------------------------

public OneClassProblemImpl(Map<P, Float> examples, Map<P, Integer> exampleIds, L label)  // set<P> examples
{
super(examples, exampleIds);
this.label = label;
}

public OneClassProblemImpl(Map<P, Float> examples, Map<P, Integer> exampleIds, L label, ScalingModel<P> learnedScalingModel)  // set<P> examples
{
super(examples, exampleIds, learnedScalingModel);
this   <component name="libraryTable">
<library name="Maven: org.testng:testng:jdk15:5.5">
<CLASSES>
<root url="jar://$MAVEN_REPOSITORY$/org/testng/testng/5.5/testng-5.5-jdk15.jar!/" />
</CLASSES>
<JAVADOC>
<root url="jar://$MAVEN_REPOSITORY$/org/testng/testng/5.5/testng-5.5-jdk15-javadoc.jar!/" />
</JAVADOC>
<SOURCES>
<root url="jar://$MAVEN_REPOSITORY$/org/testng/testng/5.5/testng-5.5-jdk15-sources.jar!/" />
</SOURCES>
</library>
</component>S ---------------------

public L getLabel()
{
return label;
}

public OneClassProblemImpl<L, P> getScaledCopy(@NotNull ScalingModelLearner<P> scalingModelLearner)
{
if (!scalingModelLearner.equals(lastScalingModelLearner))
{
scaledCopy = (OneClassProblemImpl<L, P>) learnScaling(scalingModelLearner);
lastScalingModelLearner = scalingModelLearner;
}
return scaledCopy;
}

public OneClassProblemImpl<L, P> createScaledCopy(Map<P, Float> scaledExamples, Map<P, Integer> scaledExampleIds,
ScalingModel<P> learnedScalingModel)
{
return new OneClassProblemImpl<L, P>(scaledExamples, scaledExampleIds, label, learnedScalingModel);
}
}
