/*
 * Demoiselle Framework
 * Copyright (C) 2011 SERPRO
 * ----------------------------------------------------------------------------
 * This file is part of Demoiselle Framework.
 * 
 * Demoiselle Framework is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License version 3
 * as published by the Free Software Foundation.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License version 3
 * along with this program; if not,  see <http://www.gnu.org/licenses/>
 * or write to the Free Software Foundation, Inc., 51 Franklin Street,
 * Fifth Floor, Boston, MA  02110-1301, USA.
 * ----------------------------------------------------------------------------
 * Este arquivo é parte do Framework Demoiselle.
 * 
 * O Framework Demoiselle é um software livre; você pode redistribuí-lo e/ou
 * modificá-lo dentro dos termos da GNU LGPL versão 3 como publicada pela Fundação
 * do Software Livre (FSF).
 * 
 * Este programa é distribuído na esperança que possa ser útil, mas SEM NENHUMA
 * GARANTIA; sem uma garantia implícita de ADEQUAÇÃO a qualquer MERCADO ou
 * APLICAÇÃO EM PARTICULAR. Veja a Licença Pública Geral GNU/LGPL em português
 * para maiores detalhes.
 * 
 * Você deve ter recebido uma cópia da GNU LGPL versão 3, sob o título
 * "LICENCA.txt", junto com esse programa. Se não, acesse <http://www.gnu.org/licenses/>
 * ou escreva para a Fundação do Software Livre (FSF) Inc.,
 * 51 Franklin St, Fifth Floor, Boston, MA 02111-1301, USA.
 */
package br.gov.frameworkdemoiselle.monitoring.example.trapper;

import javax.inject.Inject;

import org.slf4j.Logger;

import br.gov.frameworkdemoiselle.monitoring.annotation.SNMP;
import br.gov.frameworkdemoiselle.monitoring.annotation.snmp.MIB;
import br.gov.frameworkdemoiselle.monitoring.stereotype.Trapper;

/**
 * @author SERPRO
 */
@Trapper
@SNMP
@MIB(".25.3.1")
public class MySNMPTrapper implements IMyTrapper {

	@Inject
	private Logger logger;

//	@ManagedTrap(specificType = 5, variableBindings =
//        @ManagedObject(oid = ".1", type = OctetString.class))
	@Override
	public void sendFailure(String message) {
		logger.info("sendFailure('" + message + "')");
	}

	@Override
	public void sendDatabaseInfo(String datasource, int connections) {
		// TODO Auto-generated method stub
	}

	@Override
	public void sendUsedHeapMemory() {
		// TODO Auto-generated method stub
	}

	@Override
	public void sendDatabaseInfo(int connections) {
		// TODO Auto-generated method stub
	}

}