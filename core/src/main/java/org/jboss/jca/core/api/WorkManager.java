/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2008-2009, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jboss.jca.core.api;

import javax.resource.spi.work.WorkException;

import org.jboss.threads.BlockingExecutor;
import org.jboss.tm.JBossXATerminator;

/**
 * The JBoss specific work manager interface
 */
public interface WorkManager extends javax.resource.spi.work.WorkManager
{
   /**
    * Retrieve the executor for short running tasks
    * @return The executor
    */
   public BlockingExecutor getShortRunningThreadPool();

   /**
    * Set the executor for short running tasks
    * @param executor The executor
    */
   public void setShortRunningThreadPool(BlockingExecutor executor);

   /**
    * Retrieve the executor for long running tasks
    * @return The executor
    */
   public BlockingExecutor getLongRunningThreadPool();

   /**
    * Set the executor for long running tasks
    * @param executor The executor
    */
   public void setLongRunningThreadPool(BlockingExecutor executor);

   /**
    * Get the XATerminator
    * @return The XA terminator
    */
   public JBossXATerminator getXATerminator();

   /**
    * Set the XATerminator
    * @param xaTerminator The XA terminator
    */
   public void setXATerminator(JBossXATerminator xaTerminator);

   /**
    * Is spec compliant
    * @return True if spec compliant; otherwise false
    */
   public boolean isSpecCompliant();

   /**
    * Set spec compliant flag
    * @param v The value
    */
   public void setSpecCompliant(boolean v);
}
