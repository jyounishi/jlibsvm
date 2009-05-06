package edu.berkeley.compbio.jlibsvm.oneclass;

import edu.berkeley.compbio.jlibsvm.regression.RegressionProblem;

/**
 * @author <a href="mailto:dev@davidsoergel.com">David Soergel</a>
 * @version $Id$
 */
public interface OneClassProblem<L, P> extends RegressionProblem<P, OneClassProblem<L, P>>
	{
// -------------------------- OTHER METHODS --------------------------

	L getLabel();

	OneClassProblem<L, P> getScaledCopy(ScalingMod   <component name="libraryTable">
