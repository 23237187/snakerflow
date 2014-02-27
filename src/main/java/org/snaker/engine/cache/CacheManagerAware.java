/* Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.snaker.engine.cache;

/**
 * 该接口的实现类，需要设置cache管理器
 * @author yuqs
 * @since 1.3
 */
public interface CacheManagerAware {
	/**
	 * 设置cache管理器
	 * @param cacheManager
	 */
	void setCacheManager(CacheManager cacheManager);
}
