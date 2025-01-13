/*
 * Copyright 2024-2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.ai.mcp.server;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Timeout;

import org.springframework.ai.mcp.server.transport.HttpServletSseServerTransport;
import org.springframework.ai.mcp.spec.ServerMcpTransport;

/**
 * Tests for {@link McpAsyncServer} using {@link HttpServletSseServerTransport}.
 *
 * @author Christian Tzolov
 */
@Timeout(15) // Giving extra time beyond the client timeout
class ServletSseMcpAsyncServerTests extends AbstractMcpAsyncServerTests {

	@Override
	protected ServerMcpTransport createMcpTransport() {
		return new HttpServletSseServerTransport(new ObjectMapper(), "/mcp/message");
	}

}
