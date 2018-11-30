package org.xtext.project.turn;


import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.xtext.project.turn.turn.Actor;
import org.xtext.project.turn.turn.ComponentRef;
import org.xtext.project.turn.turn.Contribution;
import org.xtext.project.turn.turn.EndPoint;
import org.xtext.project.turn.turn.IntentionalElement;
import org.xtext.project.turn.turn.OrFork;
import org.xtext.project.turn.turn.OrJoin;
import org.xtext.project.turn.turn.RespRef;
import org.xtext.project.turn.turn.StartPoint;
import org.xtext.project.turn.turn.Stub;
import org.xtext.project.turn.turn.Timer;
import org.xtext.project.turn.turn.UCMmap;

import com.google.inject.Inject;



class MyQNP extends DefaultDeclarativeQualifiedNameProvider {
	
	@Inject IQualifiedNameConverter qnc;
	
	QualifiedName qualifiedName(IntentionalElement intElem) {
		QualifiedName intElemName=QualifiedName.create(EcoreUtil2.getContainerOfType(intElem, Actor.class).getName(), intElem.getName());
		return intElemName;
	}
	
	QualifiedName qualifiedName(Contribution cont) {
		QualifiedName contName=QualifiedName.create(EcoreUtil2.getContainerOfType(cont, Actor.class).getName(), cont.getName());
		return contName;
	}
	
	QualifiedName qualifiedName(Timer timer) {
		QualifiedName timerName=QualifiedName.create(EcoreUtil2.getContainerOfType(timer, UCMmap.class).getName(), timer.getName());
		return timerName;
	}
	
	QualifiedName qualifiedName(EndPoint endPoint) {
		return qnc.toQualifiedName(endPoint.getName());
	}
	 
	QualifiedName qualifiedName(StartPoint startPoint) {
		return qnc.toQualifiedName(startPoint.getName());
	}
	 
	QualifiedName qualifiedName(RespRef resp) {
			QualifiedName respName=QualifiedName.create(EcoreUtil2.getContainerOfType(resp, UCMmap.class).getName(), resp.getName());
			return respName;
	}
	
	QualifiedName qualifiedName(OrFork orFork) {
			QualifiedName orForkName=QualifiedName.create(EcoreUtil2.getContainerOfType(orFork, UCMmap.class).getName(), orFork.getName());
			return orForkName;
	}

	QualifiedName qualifiedName(Stub stub) {
		QualifiedName stubName=QualifiedName.create(EcoreUtil2.getContainerOfType(stub, UCMmap.class).getName(), stub.getName());
		return stubName;
	}
	
	QualifiedName qualifiedName(OrJoin orjoin) {
		QualifiedName orJoinName=QualifiedName.create(EcoreUtil2.getContainerOfType(orjoin, UCMmap.class).getName(), orjoin.getName());
		return orJoinName;
	}
	
	QualifiedName qualifiedName(ComponentRef comp) {
		QualifiedName compName=QualifiedName.create(comp.getName());
		return compName;
	}
	
}

