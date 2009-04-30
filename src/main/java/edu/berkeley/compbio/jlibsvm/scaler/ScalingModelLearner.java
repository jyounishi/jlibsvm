package edu.berkeley.compbio.jlibsvm.scaler;

/**
 * @author <a href="mailto:dev@davidsoergel.com">David Soergel</a>
 * @version $Id$
 */
public interface ScalingModelLearner<P>
	{
	public ScalingModel<P> learnScaling(Iterable<P> examples);
	}
