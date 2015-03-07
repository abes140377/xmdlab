package org.application.manager.document;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QOrganisation is a Querydsl query type for Organisation
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QOrganisation extends EntityPathBase<Organisation> {

    private static final long serialVersionUID = 1714260164L;

    public static final QOrganisation organisation = new QOrganisation("organisation");

    public final org.xmdlab.framework.jee.document.QAbstractDocument _super = new org.xmdlab.framework.jee.document.QAbstractDocument(this);

    public final StringPath description = createString("description");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath name = createString("name");

    public final SetPath<Team, QTeam> teams = this.<Team, QTeam>createSet("teams", Team.class, QTeam.class, PathInits.DIRECT2);

    public QOrganisation(String variable) {
        super(Organisation.class, forVariable(variable));
    }

    public QOrganisation(Path<? extends Organisation> path) {
        super(path.getType(), path.getMetadata());
    }

    public QOrganisation(PathMetadata<?> metadata) {
        super(Organisation.class, metadata);
    }

}

