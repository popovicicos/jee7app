FROM payara/server-full:174
#from payara image:
#   The default user and password is admin.
#   The default Docker entry point will scan the folder $DEPLOY_DIR for files and folders and deploy them automatically after the domain is started.

USER root
RUN chgrp -R 0 /opt/payara41 && \
    chmod -R g+rw /opt/payara41 && \
    find /opt/payara41 -type d -exec chmod g+x {} +
USER payara

COPY ./alreadybuilt/*.war ${DEPLOY_DIR}
#COPY ./target/*.war ${DEPLOY_DIR}
