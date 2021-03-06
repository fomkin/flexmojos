/**
 * Flexmojos is a set of maven goals to allow maven users to compile, optimize and test Flex SWF, Flex SWC, Air SWF and Air SWC.
 * Copyright (C) 2008-2012  Marvin Froeder <marvin@flexmojos.net>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.flexmojos.oss.configurator.sample;

import java.io.File;
import java.util.Map;

import net.flexmojos.oss.compiler.ICommandLineConfiguration;
import net.flexmojos.oss.compiler.ICompcConfiguration;
import net.flexmojos.oss.configurator.Configurator;
import net.flexmojos.oss.configurator.ConfiguratorException;

public class SampleConfigurator
    implements Configurator
{

    public void buildConfiguration( ICommandLineConfiguration swf, File sourceFile, Map<String, Object> parameters )
        throws ConfiguratorException
    {
        System.out.println( "Running configurator for a SWF project." );
        System.out.println( swf.getOutput() );
    }

    public void buildConfiguration( ICompcConfiguration swc, Map<String, Object> parameters )
    {
        System.out.println( "Running configurator for a SWC project." );
        System.out.println( swc.getOutput() );
    }

}
