package org.pac4j.saml.exceptions;

/**
 * This is {@link SAMLAssertionConditionException}.
 *
 * @author Misagh Moayyed
 * @since 3.0.0
 */
public class SAMLAssertionConditionException extends SAMLException {
    private static final long serialVersionUID = -5853248740778879997L;

    public SAMLAssertionConditionException(final String message) {
        super(message);
    }

    public SAMLAssertionConditionException(final Throwable t) {
        super(t);
    }

    public SAMLAssertionConditionException(final String message, final Throwable t) {
        super(message, t);
    }
}
